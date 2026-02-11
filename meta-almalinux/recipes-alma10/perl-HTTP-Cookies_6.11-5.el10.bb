
PN = "perl-HTTP-Cookies"
PE = "0"
PV = "6.11"
PR = "5.el10"
PACKAGES = "perl-HTTP-Cookies perl-HTTP-Cookies-tests"


URI_perl-HTTP-Cookies = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Cookies-6.11-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Cookies = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(locale) ( ) perl(HTTP::Cookies) ( ) perl(HTTP::Cookies::Netscape) ( ) perl(HTTP::Date) ( >=  6) perl(HTTP::Headers::Util) ( >=  6)"
RPROVIDES:perl-HTTP-Cookies = "perl(HTTP::Cookies) ( =  6.11) perl(HTTP::Cookies::Microsoft) ( =  6.11) perl(HTTP::Cookies::Netscape) ( =  6.11) perl-HTTP-Cookies ( =  6.11-5.el10)"

URI_perl-HTTP-Cookies-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Cookies-tests-6.11-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Cookies-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) coreutils ( ) perl(URI) ( ) perl(HTTP::Request) ( ) perl(HTTP::Response) ( ) perl(HTTP::Cookies) ( ) perl-HTTP-Cookies ( =  6.11-5.el10)"
RPROVIDES:perl-HTTP-Cookies-tests = "perl-HTTP-Cookies-tests ( =  6.11-5.el10)"
