
PN = "perl-Digest-CRC"
PE = "0"
PV = "0.24"
PR = "11.el10"
PACKAGES = "perl-Digest-CRC perl-Digest-CRC-tests"


URI_perl-Digest-CRC = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Digest-CRC-0.24-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-CRC = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(vars) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(DynaLoader) ( ) perl(Symbol) ( )"
RPROVIDES:perl-Digest-CRC = "perl(Digest::CRC) ( =  0.24) perl-Digest-CRC ( =  0.24-11.el10) perl-Digest-CRC(x86-64) ( =  0.24-11.el10)"

URI_perl-Digest-CRC-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-CRC-tests-0.24-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-CRC-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Fcntl) ( ) perl(Digest::CRC) ( ) perl-Digest-CRC ( =  0.24-11.el10)"
RPROVIDES:perl-Digest-CRC-tests = "perl-Digest-CRC-tests ( =  0.24-11.el10) perl-Digest-CRC-tests(x86-64) ( =  0.24-11.el10)"
