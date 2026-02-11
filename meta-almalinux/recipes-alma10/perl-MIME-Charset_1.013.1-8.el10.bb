
PN = "perl-MIME-Charset"
PE = "0"
PV = "1.013.1"
PR = "8.el10"
PACKAGES = "perl-MIME-Charset perl-MIME-Charset-tests"


URI_perl-MIME-Charset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-MIME-Charset-1.013.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-MIME-Charset = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( ) perl(Encode::Encoding) ( ) perl(:VERSION) ( >=  5.5.0) perl(:VERSION) ( >=  5.4.0)"
RPROVIDES:perl-MIME-Charset = "perl(MIME::Charset) ( =  1.013.1) perl(MIME::Charset::UTF) ( =  1.010) perl(MIME::Charset::_Compat) ( =  1.003.1) perl-MIME-Charset ( =  1.013.1-8.el10)"

URI_perl-MIME-Charset-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-MIME-Charset-tests-1.013.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-MIME-Charset-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(Test) ( ) perl(MIME::Charset) ( ) perl-MIME-Charset ( =  1.013.1-8.el10)"
RPROVIDES:perl-MIME-Charset-tests = "perl-MIME-Charset-tests ( =  1.013.1-8.el10)"
