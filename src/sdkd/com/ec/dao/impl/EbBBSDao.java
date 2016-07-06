package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbBBS;
import sdkd.com.ec.model.EbNews;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdust on 2016/7/7.
 */
public class EbBBSDao extends BaseDao {
    public List<EbBBS> getBBS() {
        List<EbBBS> bbsList = new ArrayList<EbBBS>();
        String sql = "select * from easybuy_bbs order by ebbs_create_time desc limit 0,7";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EbBBS bbs = new EbBBS();
                bbs.setEbbsId(rs.getInt("ebbs_id"));
                bbs.setEbbsTitle(rs.getString("ebbs_title"));
                //添加到集合中
                bbsList.add(bbs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bbsList;
    }
}
