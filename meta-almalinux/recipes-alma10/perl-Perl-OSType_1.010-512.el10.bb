
PN = "perl-Perl-OSType"
PE = "0"
PV = "1.010"
PR = "512.el10"
PACKAGES = "perl-Perl-OSType perl-Perl-OSType-tests"


URI_perl-Perl-OSType = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Perl-OSType-1.010-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Perl-OSType = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-Perl-OSType-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Perl-OSType-tests-1.010-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Perl-OSType-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-Perl-OSType \
 perl-interpreter \
"
