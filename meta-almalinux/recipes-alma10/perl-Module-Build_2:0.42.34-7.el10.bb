
PN = "perl-Module-Build"
PE = "2"
PV = "0.42.34"
PR = "7.el10"
PACKAGES = "perl-Module-Build perl-Module-Build-tests"


URI_perl-Module-Build = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Build-0.42.34-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Build = " \
 perl-libs \
 perl-Software-License \
 perl-Getopt-Long \
 perl-podlators \
 perl-inc-latest \
 perl-CPAN-Meta \
 perl-Test-Harness \
 perl-Carp \
 perl-version \
 perl-Text-ParseWords \
 perl-Data-Dumper \
 perl-Module-Build \
 perl-Module-Metadata \
 perl-ExtUtils-Install \
 perl-ExtUtils-MakeMaker \
 perl-ExtUtils-Manifest \
 perl-ExtUtils-ParseXS \
 perl-File-Basename \
 perl-File-Compare \
 perl-File-Copy \
 perl-PathTools \
 perl-Perl-OSType \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-Pod-Html \
"

URI_perl-Module-Build-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Build-tests-0.42.34-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Build-tests = " \
 perl-libs \
 perl-CPAN-Meta \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-CPAN-Meta-YAML \
 perl-version \
 perl-Text-ParseWords \
 perl-lib \
 perl-Data-Dumper \
 perl-Module-Build \
 perl-Encode \
 bash \
 perl-Exporter \
 perl-base \
 perl-ExtUtils-Install \
 perl-File-Basename \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"
