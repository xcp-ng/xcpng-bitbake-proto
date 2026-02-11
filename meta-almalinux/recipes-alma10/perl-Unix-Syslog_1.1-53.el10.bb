
PN = "perl-Unix-Syslog"
PE = "0"
PV = "1.1"
PR = "53.el10"
PACKAGES = "perl-Unix-Syslog perl-Unix-Syslog-tests"


URI_perl-Unix-Syslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unix-Syslog-1.1-53.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unix-Syslog = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(DynaLoader) ( ) syslog ( )"
RPROVIDES:perl-Unix-Syslog = "perl(Unix::Syslog) ( =  1.1) perl-Unix-Syslog ( =  1.1-53.el10) perl-Unix-Syslog(x86-64) ( =  1.1-53.el10)"

URI_perl-Unix-Syslog-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unix-Syslog-tests-1.1-53.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unix-Syslog-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Unix::Syslog) ( ) perl-Unix-Syslog ( =  1.1-53.el10)"
RPROVIDES:perl-Unix-Syslog-tests = "perl-Unix-Syslog-tests ( =  1.1-53.el10) perl-Unix-Syslog-tests(x86-64) ( =  1.1-53.el10)"
