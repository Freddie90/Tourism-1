package za.ac.cput.domain.Airline;



public class Plane {


    private String plneType, plneCode;

    private Plane() {
    }

    private Plane(Plane.Builder builder) {
        this.plneType = builder.plneType;
        this.plneCode = builder.plneCode;

    }

    public String getPlneType() {

        return plneType;
    }

    public String getPlneCode() {

        return plneCode;

    }

    public static class Builder {

        private String plneType, plneCode;


        public Builder plneType(String plneType) {
            this.plneType = plneType;
            return this;
        }

        public Builder plneCode(String plneCode) {
            this.plneCode = plneCode;
            return this;
        }


        public Plane build() {
            return new Plane(this);
        }


    }
}


