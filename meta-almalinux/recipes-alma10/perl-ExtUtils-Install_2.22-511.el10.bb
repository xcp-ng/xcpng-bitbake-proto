
PN = "perl-ExtUtils-Install"
PE = "0"
PV = "2.22"
PR = "511.el10"
PACKAGES = "perl-ExtUtils-Install perl-ExtUtils-Install-tests"


URI_perl-ExtUtils-Install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-Install-2.22-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Install = " \
 perl-ExtUtils-Install \
 perl-libs \
 perl-Carp \
 perl-ExtUtils-MakeMaker \
 perl-File-Basename \
 perl-File-Compare \
 perl-File-Copy \
 perl-PathTools \
 perl-AutoSplit \
 perl-File-Find \
 perl-Exporter \
 perl-File-Path \
 perl-Data-Dumper \
"

URI_perl-ExtUtils-Install-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-Install-tests-2.22-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Install-tests = " \
 perl-ExtUtils-Install \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 make \
 perl-File-Basename \
 perl-File-Compare \
 bash \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-Exporter \
 perl-File-Temp \
"
