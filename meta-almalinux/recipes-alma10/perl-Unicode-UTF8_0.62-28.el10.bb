
PN = "perl-Unicode-UTF8"
PE = "0"
PV = "0.62"
PR = "28.el10"
PACKAGES = "perl-Unicode-UTF8 perl-Unicode-UTF8-tests"


URI_perl-Unicode-UTF8 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Unicode-UTF8-0.62-28.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-UTF8 = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(XSLoader) ( )"
RPROVIDES:perl-Unicode-UTF8 = "perl(Unicode::UTF8) ( =  0.62) perl-Unicode-UTF8 ( =  0.62-28.el10) perl-Unicode-UTF8(x86-64) ( =  0.62-28.el10)"

URI_perl-Unicode-UTF8-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unicode-UTF8-tests-0.62-28.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-UTF8-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Carp) ( ) perl(utf8) ( ) perl(Scalar::Util) ( ) perl(Encode) ( ) perl(IO::File) ( ) perl(Test::Fatal) ( ) perl-Unicode-UTF8 ( =  0.62-28.el10)"
RPROVIDES:perl-Unicode-UTF8-tests = "perl-Unicode-UTF8-tests ( =  0.62-28.el10) perl-Unicode-UTF8-tests(x86-64) ( =  0.62-28.el10)"
