package week3.CreationalPatterns.builder;

import java.time.LocalDate;

public class JobPosition {
    private LocalDate publishedDate;
    private String title;
    private String description;
    private String location;
    private double salaryCap;
    private boolean isRemote;
    private int experienceYears;

    public static class Builder {

        private LocalDate publishedDate;
        private String title;
        private boolean isRemote;

        private String description;
        private String location = "Tel Aviv";
        private double salaryCap;
        private int experienceYears = 0;

        public Builder(LocalDate publishedDate, String title,boolean isRemote) {
            this.publishedDate = publishedDate;
            this.title = title;
            this.isRemote = isRemote;
        }

        public Builder description(String desc) {
            this.description = desc;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder salaryCap(double salaryCap) {
            this.salaryCap = salaryCap;
            return this;
        }

        public Builder experienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }

        public JobPosition build() {
                return new JobPosition(this);
            }
        }

        private JobPosition(Builder builder) {
            this.publishedDate = builder.publishedDate;
            this.title = builder.title;
            this.description = builder.description;
            this.location = builder.location;
            this.salaryCap = builder.salaryCap;
            this.isRemote = builder.isRemote;
            this.experienceYears = builder.experienceYears;
        }

    @Override
    public String toString() {
        return "JobPosition{" +
                "publishedDate=" + publishedDate +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", salaryCap=" + salaryCap +
                ", isRemote=" + isRemote +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
