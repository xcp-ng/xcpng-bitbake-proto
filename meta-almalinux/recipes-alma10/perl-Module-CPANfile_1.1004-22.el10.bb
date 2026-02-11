
PN = "perl-Module-CPANfile"
PE = "0"
PV = "1.1004"
PR = "22.el10"
PACKAGES = "perl-Module-CPANfile perl-Module-CPANfile-tests"


URI_perl-Module-CPANfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-CPANfile-1.1004-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-CPANfile = " \
 perl-CPAN-Meta \
 perl-CPAN-Meta-Requirements \
 perl-libs \
 perl-Carp \
 perl-Module-CPANfile \
 perl-Getopt-Long \
 perl-PathTools \
 perl-interpreter \
 perl-Data-Dumper \
 perl-Pod-Usage \
"

URI_perl-Module-CPANfile-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-CPANfile-tests-1.1004-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-CPANfile-tests = " \
 perl-File-pushd \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Module-CPANfile \
 perl-POSIX \
 bash \
 perl-base \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
