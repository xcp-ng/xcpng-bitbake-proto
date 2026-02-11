
PN = "perl-HTTP-Negotiate"
PE = "0"
PV = "6.01"
PR = "40.el10"
PACKAGES = "perl-HTTP-Negotiate perl-HTTP-Negotiate-tests"


URI_perl-HTTP-Negotiate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Negotiate-6.01-40.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Negotiate = "perl-libs ( ) perl(Exporter) ( ) perl(HTTP::Headers) ( >=  6)"
RPROVIDES:perl-HTTP-Negotiate = "perl(HTTP::Negotiate) ( =  6.01) perl-HTTP-Negotiate ( =  6.01-40.el10)"

URI_perl-HTTP-Negotiate-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Negotiate-tests-6.01-40.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Negotiate-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test) ( ) perl(HTTP::Request) ( ) perl(HTTP::Negotiate) ( ) perl-HTTP-Negotiate ( =  6.01-40.el10)"
RPROVIDES:perl-HTTP-Negotiate-tests = "perl-HTTP-Negotiate-tests ( =  6.01-40.el10)"
