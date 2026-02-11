
inherit dnf-bridge

PN = "perl-HTTP-Cookies"
PE = "0"
PV = "6.11"
PR = "5.el10"
PACKAGES = "perl-HTTP-Cookies perl-HTTP-Cookies-tests"


URI_perl-HTTP-Cookies = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Cookies-6.11-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Cookies = " \
 perl-libs \
 perl-Carp \
 perl-locale \
 perl-HTTP-Cookies \
 perl-HTTP-Date \
 perl-HTTP-Message \
"

URI_perl-HTTP-Cookies-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Cookies-tests-6.11-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Cookies-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-URI \
 perl-HTTP-Message \
 bash \
 perl-HTTP-Cookies \
 coreutils \
 perl-interpreter \
"
