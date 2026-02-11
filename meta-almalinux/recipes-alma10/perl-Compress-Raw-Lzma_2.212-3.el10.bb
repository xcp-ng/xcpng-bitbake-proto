
PN = "perl-Compress-Raw-Lzma"
PE = "0"
PV = "2.212"
PR = "3.el10"
PACKAGES = "perl-Compress-Raw-Lzma perl-Compress-Raw-Lzma-tests"


URI_perl-Compress-Raw-Lzma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Raw-Lzma-2.212-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Lzma = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(constant) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Scalar::Util) ( ) perl(bytes) ( ) perl(AutoLoader) ( ) perl(UNIVERSAL) ( ) perl(:VERSION) ( >=  5.6.0) xz-libs(x86-64) ( =  1:5.6.2)"
RPROVIDES:perl-Compress-Raw-Lzma = "perl(Compress::Raw::Lzma) ( =  2.212) perl-Compress-Raw-Lzma ( =  2.212-3.el10) perl-Compress-Raw-Lzma(x86-64) ( =  2.212-3.el10)"

URI_perl-Compress-Raw-Lzma-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Raw-Lzma-tests-2.212-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Lzma-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(lib) ( ) perl(Carp) ( ) perl(File::Path) ( ) perl(constant) ( ) perl(bytes) ( ) perl-Compress-Raw-Lzma ( =  2.212-3.el10)"
RPROVIDES:perl-Compress-Raw-Lzma-tests = "perl-Compress-Raw-Lzma-tests ( =  2.212-3.el10) perl-Compress-Raw-Lzma-tests(x86-64) ( =  2.212-3.el10)"
