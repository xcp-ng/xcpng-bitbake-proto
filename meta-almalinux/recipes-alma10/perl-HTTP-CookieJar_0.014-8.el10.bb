
PN = "perl-HTTP-CookieJar"
PE = "0"
PV = "0.014"
PR = "8.el10"
PACKAGES = "perl-HTTP-CookieJar perl-HTTP-CookieJar-tests"


URI_perl-HTTP-CookieJar = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-CookieJar-0.014-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-CookieJar = "perl(strict) ( ) perl(warnings) ( ) perl(Carp) ( ) perl-libs ( ) perl(parent) ( ) perl(HTTP::CookieJar) ( ) perl(HTTP::Date) ( ) perl(:VERSION) ( >=  5.8.1)"
RPROVIDES:perl-HTTP-CookieJar = "perl-HTTP-CookieJar ( =  0.014-8.el10) perl(HTTP::CookieJar) ( =  0.014) perl(HTTP::CookieJar::LWP) ( =  0.014)"

URI_perl-HTTP-CookieJar-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-CookieJar-tests-0.014-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-CookieJar-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(lib) ( ) perl(Test::Deep) ( ) perl(URI) ( ) perl(HTTP::CookieJar) ( ) perl(HTTP::CookieJar::LWP) ( ) perl(Time::Local) ( ) perl(Test::Requires) ( ) perl(:VERSION) ( >=  5.8.1) perl(Test::More) ( >=  0.96) perl-HTTP-CookieJar ( =  0.014-8.el10)"
RPROVIDES:perl-HTTP-CookieJar-tests = "perl-HTTP-CookieJar-tests ( =  0.014-8.el10)"
