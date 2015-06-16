package cn.com.gps169.db.model;

public class UserVehicle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vehicle.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vehicle.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    private Integer vehicleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vehicle.id
     *
     * @return the value of user_vehicle.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vehicle.id
     *
     * @param id the value for user_vehicle.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vehicle.user_id
     *
     * @return the value of user_vehicle.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vehicle.user_id
     *
     * @param userId the value for user_vehicle.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vehicle.vehicle_id
     *
     * @return the value of user_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vehicle.vehicle_id
     *
     * @param vehicleId the value for user_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_vehicle
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserVehicle other = (UserVehicle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_vehicle
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        return result;
    }
}