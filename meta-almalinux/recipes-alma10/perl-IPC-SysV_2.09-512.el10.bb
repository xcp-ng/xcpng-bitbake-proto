
PN = "perl-IPC-SysV"
PE = "0"
PV = "2.09"
PR = "512.el10"
PACKAGES = "perl-IPC-SysV perl-IPC-SysV-tests"


URI_perl-IPC-SysV = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IPC-SysV-2.09-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-IPC-SysV = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(XSLoader) ( ) perl(Config) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Class::Struct) ( ) perl(IPC::SysV) ( )"
RPROVIDES:perl-IPC-SysV = "perl(IPC::Msg::stat) ( ) perl(IPC::Semaphore::stat) ( ) perl(IPC::SharedMem::stat) ( ) perl(IPC::Msg) ( =  2.09) perl(IPC::Semaphore) ( =  2.09) perl(IPC::SharedMem) ( =  2.09) perl(IPC::SysV) ( =  2.09) perl-IPC-SysV ( =  2.09-512.el10) perl-IPC-SysV(x86-64) ( =  2.09-512.el10)"

URI_perl-IPC-SysV-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-SysV-tests-2.09-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-SysV-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(IPC::Msg) ( ) perl(IPC::Semaphore) ( ) perl(IPC::SharedMem) ( ) perl(IPC::SysV) ( ) perl-IPC-SysV ( =  2.09-512.el10)"
RPROVIDES:perl-IPC-SysV-tests = "perl-IPC-SysV-tests ( =  2.09-512.el10)"
