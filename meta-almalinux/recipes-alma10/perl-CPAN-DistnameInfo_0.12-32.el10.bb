
inherit dnf-bridge

PN = "perl-CPAN-DistnameInfo"
PE = "0"
PV = "0.12"
PR = "32.el10"
PACKAGES = "perl-CPAN-DistnameInfo perl-CPAN-DistnameInfo-tests"


URI_perl-CPAN-DistnameInfo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-DistnameInfo-0.12-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-DistnameInfo = " \
 perl-libs \
"

URI_perl-CPAN-DistnameInfo-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-DistnameInfo-tests-0.12-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-DistnameInfo-tests = " \
 perl-Test-Harness \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-Data-Dumper \
 perl-CPAN-DistnameInfo \
"
