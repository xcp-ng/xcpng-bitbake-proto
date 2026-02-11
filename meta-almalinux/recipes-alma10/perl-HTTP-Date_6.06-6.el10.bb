
PN = "perl-HTTP-Date"
PE = "0"
PV = "6.06"
PR = "6.el10"
PACKAGES = "perl-HTTP-Date perl-HTTP-Date-tests"


URI_perl-HTTP-Date = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Date-6.06-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Date = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(Time::Zone) ( ) perl(Time::Local) ( >=  1.28)"
RPROVIDES:perl-HTTP-Date = "perl(HTTP::Date) ( =  6.06) perl-HTTP-Date ( =  6.06-6.el10)"

URI_perl-HTTP-Date-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Date-tests-6.06-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Date-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(HTTP::Date) ( ) perl-HTTP-Date ( =  6.06-6.el10)"
RPROVIDES:perl-HTTP-Date-tests = "perl-HTTP-Date-tests ( =  6.06-6.el10)"
