
inherit dnf-bridge

PN = "perl-HTTP-Date"
PE = "0"
PV = "6.06"
PR = "6.el10"
PACKAGES = "perl-HTTP-Date perl-HTTP-Date-tests"


URI_perl-HTTP-Date = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Date-6.06-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Date = " \
 perl-Exporter \
 perl-libs \
 perl-TimeDate \
 perl-Time-Local \
"

URI_perl-HTTP-Date-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Date-tests-6.06-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Date-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-HTTP-Date \
 perl-interpreter \
"
