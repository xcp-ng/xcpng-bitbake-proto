
PN = "perl-Sys-Syslog"
PE = "0"
PV = "0.36"
PR = "512.el10"
PACKAGES = "perl-Sys-Syslog perl-Sys-Syslog-tests"


URI_perl-Sys-Syslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sys-Syslog-0.36-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Sys-Syslog = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(XSLoader) ( ) perl(constant) ( ) perl(Config) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Fcntl) ( ) perl(warnings::register) ( ) perl(Socket) ( ) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-Sys-Syslog = "perl(Sys::Syslog) ( =  0.36) perl-Sys-Syslog ( =  0.36-512.el10) perl-Sys-Syslog(x86-64) ( =  0.36-512.el10)"

URI_perl-Sys-Syslog-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sys-Syslog-tests-0.36-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Sys-Syslog-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(Socket) ( ) perl(FileHandle) ( ) perl-Sys-Syslog ( =  0.36-512.el10) perl(Sys::Syslog) ( >=  0.30)"
RPROVIDES:perl-Sys-Syslog-tests = "perl-Sys-Syslog-tests ( =  0.36-512.el10) perl-Sys-Syslog-tests(x86-64) ( =  0.36-512.el10)"
