
PN = "perl-IO-Tty"
PE = "0"
PV = "1.20"
PR = "7.el10"
PACKAGES = "perl-IO-Tty perl-IO-Tty-tests"


URI_perl-IO-Tty = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-Tty-1.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-IO-Tty = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(vars) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(POSIX) ( ) perl(IO::Handle) ( ) perl(DynaLoader) ( ) perl(IO::File) ( ) perl(IO::Tty) ( ) perl(IO::Tty::Constant) ( )"
RPROVIDES:perl-IO-Tty = "perl(IO::Pty) ( =  1.20) perl(IO::Tty) ( =  1.20) perl(IO::Tty::Constant) ( =  1.20) perl-IO-Tty ( =  1.20-7.el10) perl-IO-Tty(x86-64) ( =  1.20-7.el10)"

URI_perl-IO-Tty-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Tty-tests-1.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-IO-Tty-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(POSIX) ( ) perl(IO::Pty) ( ) perl(IO::Tty) ( ) perl-IO-Tty ( =  1.20-7.el10)"
RPROVIDES:perl-IO-Tty-tests = "perl-IO-Tty-tests ( =  1.20-7.el10) perl-IO-Tty-tests(x86-64) ( =  1.20-7.el10)"
