
inherit dnf-bridge

PN = "perl-Term-Size-Perl"
PE = "0"
PV = "0.031"
PR = "22.el10"
PACKAGES = "perl-Term-Size-Perl perl-Term-Size-Perl-tests"


URI_perl-Term-Size-Perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Size-Perl-0.031-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Perl = " \
 perl-Exporter \
 perl-libs \
 perl-vars \
 perl-Term-Size-Perl \
"

URI_perl-Term-Size-Perl-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Size-Perl-tests-0.031-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Perl-tests = " \
 perl-Test-Harness \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-Term-Size-Perl \
"
