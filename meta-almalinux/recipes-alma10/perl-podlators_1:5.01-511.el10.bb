
PN = "perl-podlators"
PE = "1"
PV = "5.01"
PR = "511.el10"
PACKAGES = "perl-podlators perl-podlators-tests"


URI_perl-podlators = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-podlators-5.01-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-podlators = " \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-Getopt-Long \
 perl-POSIX \
 perl-File-Basename \
 perl-Encode \
 perl-PathTools \
 perl-Term-ANSIColor \
 perl-Term-Cap \
 perl-podlators \
 perl-Exporter \
 perl-Pod-Simple \
 perl-Pod-Usage \
"

URI_perl-podlators-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-podlators-tests-5.01-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-podlators-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-IO \
 perl-Getopt-Long \
 perl-POSIX \
 perl-Encode \
 perl-File-Temp \
 bash \
 perl-PathTools \
 perl-base \
 perl-File-Find \
 perl-podlators \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
