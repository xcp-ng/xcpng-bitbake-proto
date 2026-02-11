
PN = "perl-Compress-Bzip2"
PE = "0"
PV = "2.28"
PR = "21.el10"
PACKAGES = "perl-Compress-Bzip2 perl-Compress-Bzip2-tests"


URI_perl-Compress-Bzip2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Bzip2-2.28-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Bzip2 = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Fcntl) ( ) perl(Getopt::Std) ( ) libbz2.so.1()(64bit) ( ) perl(AutoLoader) ( ) perl(:VERSION) ( >=  5.6.0) perl(constant) ( >=  1.04)"
RPROVIDES:perl-Compress-Bzip2 = "perl(Compress::Bzip2) ( =  2.28) perl-Compress-Bzip2 ( =  2.28-21.el10) perl-Compress-Bzip2(x86-64) ( =  2.28-21.el10)"

URI_perl-Compress-Bzip2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Bzip2-tests-2.28-21.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Compress-Bzip2-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(Config) ( ) perl(Cwd) ( ) coreutils ( ) perl(Fcntl) ( ) perl(File::Copy) ( ) bash ( ) bzip2 ( ) perl(Compress::Bzip2) ( ) perl-Compress-Bzip2 ( =  2.28-21.el10)"
RPROVIDES:perl-Compress-Bzip2-tests = "perl-Compress-Bzip2-tests ( =  2.28-21.el10)"
