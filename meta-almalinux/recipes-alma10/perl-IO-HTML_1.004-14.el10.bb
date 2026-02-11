
PN = "perl-IO-HTML"
PE = "0"
PV = "1.004"
PR = "14.el10"
PACKAGES = "perl-IO-HTML perl-IO-HTML-tests"


URI_perl-IO-HTML = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-HTML-1.004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-HTML = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(:VERSION) ( >=  5.8.0) perl(Exporter) ( >=  5.57) perl(Encode) ( >=  2.10)"
RPROVIDES:perl-IO-HTML = "perl(IO::HTML) ( =  1.004) perl-IO-HTML ( =  1.004-14.el10)"

URI_perl-IO-HTML-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-HTML-tests-1.004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-HTML-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Temp) ( ) perl(Scalar::Util) ( ) perl(Encode) ( ) perl(IO::HTML) ( ) perl(Test::More) ( >=  0.88) perl-IO-HTML ( =  1.004-14.el10)"
RPROVIDES:perl-IO-HTML-tests = "perl-IO-HTML-tests ( =  1.004-14.el10)"
