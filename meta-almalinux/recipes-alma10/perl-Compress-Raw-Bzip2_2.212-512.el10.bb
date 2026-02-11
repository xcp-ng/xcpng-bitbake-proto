
PN = "perl-Compress-Raw-Bzip2"
PE = "0"
PV = "2.212"
PR = "512.el10"
PACKAGES = "perl-Compress-Raw-Bzip2 perl-Compress-Raw-Bzip2-tests"


URI_perl-Compress-Raw-Bzip2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Raw-Bzip2-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Bzip2 = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(constant) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libbz2.so.1()(64bit) ( ) perl(bytes) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Compress-Raw-Bzip2 = "perl(Compress::Raw::Bzip2) ( =  2.212) perl-Compress-Raw-Bzip2 ( =  2.212-512.el10) perl-Compress-Raw-Bzip2(x86-64) ( =  2.212-512.el10)"

URI_perl-Compress-Raw-Bzip2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Raw-Bzip2-tests-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Bzip2-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Carp) ( ) perl(File::Path) ( ) perl(bytes) ( ) perl-Compress-Raw-Bzip2 ( =  2.212-512.el10)"
RPROVIDES:perl-Compress-Raw-Bzip2-tests = "perl-Compress-Raw-Bzip2-tests ( =  2.212-512.el10) perl-Compress-Raw-Bzip2-tests(x86-64) ( =  2.212-512.el10)"
