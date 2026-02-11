
PN = "perl-Encode-EUCJPASCII"
PE = "0"
PV = "0.03"
PR = "45.el10"
PACKAGES = "perl-Encode-EUCJPASCII perl-Encode-EUCJPASCII-tests"


URI_perl-Encode-EUCJPASCII = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Encode-EUCJPASCII-0.03-45.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Encode-EUCJPASCII = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl(warnings) ( ) perl-libs ( ) perl(base) ( ) perl(Encode) ( ) perl(XSLoader) ( ) libperl.so.5.38()(64bit) ( ) perl(:MODULE_COMPAT_5.38.2) ( ) perl(bytes) ( ) perl(Encode::Encoding) ( ) perl(Encode::CJKConstants) ( ) perl(Encode::JP::JIS7) ( )"
RPROVIDES:perl-Encode-EUCJPASCII = "perl-Encode-EUCJPASCII ( =  0.03-45.el10) perl(Encode::EUCJPASCII) ( =  0.03) perl-Encode-EUCJPASCII(x86-64) ( =  0.03-45.el10)"

URI_perl-Encode-EUCJPASCII-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Encode-EUCJPASCII-tests-0.03-45.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Encode-EUCJPASCII-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl-Encode-EUCJPASCII ( =  0.03-45.el10)"
RPROVIDES:perl-Encode-EUCJPASCII-tests = "perl-Encode-EUCJPASCII-tests ( =  0.03-45.el10) perl-Encode-EUCJPASCII-tests(x86-64) ( =  0.03-45.el10)"
