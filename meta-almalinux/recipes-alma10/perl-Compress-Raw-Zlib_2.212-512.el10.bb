
PN = "perl-Compress-Raw-Zlib"
PE = "0"
PV = "2.212"
PR = "512.el10"
PACKAGES = "perl-Compress-Raw-Zlib perl-Compress-Raw-Zlib-tests"


URI_perl-Compress-Raw-Zlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Raw-Zlib-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Zlib = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) libz.so.1()(64bit) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(constant) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(bytes) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( ) libz.so.1(ZLIB_1.2.0.2)(64bit) ( ) libz.so.1(ZLIB_1.2.0.8)(64bit) ( ) libz.so.1(ZLIB_1.2.2.3)(64bit) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Compress-Raw-Zlib = "perl(Compress::Raw::Zlib) ( =  2.212) perl-Compress-Raw-Zlib ( =  2.212-512.el10) perl-Compress-Raw-Zlib(x86-64) ( =  2.212-512.el10)"

URI_perl-Compress-Raw-Zlib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Raw-Zlib-tests-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Zlib-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Carp) ( ) perl(File::Path) ( ) perl(constant) ( ) perl(bytes) ( ) perl(List::Util) ( ) perl(Compress::Raw::Zlib) ( ) perl-Compress-Raw-Zlib ( =  2.212-512.el10)"
RPROVIDES:perl-Compress-Raw-Zlib-tests = "perl-Compress-Raw-Zlib-tests ( =  2.212-512.el10) perl-Compress-Raw-Zlib-tests(x86-64) ( =  2.212-512.el10)"
