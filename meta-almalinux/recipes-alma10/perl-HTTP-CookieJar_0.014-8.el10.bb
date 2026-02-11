
PN = "perl-HTTP-CookieJar"
PE = "0"
PV = "0.014"
PR = "8.el10"
PACKAGES = "perl-HTTP-CookieJar perl-HTTP-CookieJar-tests"


URI_perl-HTTP-CookieJar = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-CookieJar-0.014-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-CookieJar = "
 perl-libs
 perl-Carp
 perl-HTTP-CookieJar
 perl-parent
 perl-HTTP-Date
"

URI_perl-HTTP-CookieJar-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-CookieJar-tests-0.014-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-CookieJar-tests = "
 perl-Test-Requires
 perl-Test-Harness
 perl-libs
 perl-Test-Deep
 perl-URI
 perl-Test-Simple
 perl-HTTP-CookieJar
 bash
 perl-interpreter
 perl-lib
 perl-Time-Local
"
