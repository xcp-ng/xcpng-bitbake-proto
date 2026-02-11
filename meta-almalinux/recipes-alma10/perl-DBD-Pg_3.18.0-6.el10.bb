
PN = "perl-DBD-Pg"
PE = "0"
PV = "3.18.0"
PR = "6.el10"
PACKAGES = "perl-DBD-Pg perl-DBD-Pg-tests"


URI_perl-DBD-Pg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-Pg-3.18.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-Pg = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(constant) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) perl(version) ( ) perl(:VERSION) ( >=  5.8.1) perl(DBI) ( >=  1.614)"
RPROVIDES:perl-DBD-Pg = "perl(DBD::Pg::DefaultValue) ( ) perl(DBD::Pg::db) ( ) perl(DBD::Pg::dr) ( ) perl(DBD::Pg::st) ( ) perl(Bundle::DBD::Pg) ( =  3.18.0) perl(DBD::Pg) ( =  3.18.0) perl-DBD-Pg ( =  3.18.0-6.el10) perl-DBD-Pg(x86-64) ( =  3.18.0-6.el10)"

URI_perl-DBD-Pg-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-Pg-tests-3.18.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-Pg-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(utf8) ( ) perl(constant) ( ) perl(Encode) ( ) perl(POSIX) ( ) perl(Fcntl) ( ) perl(open) ( ) perl(Time::HiRes) ( ) perl(Test::Simple) ( ) perl(charnames) ( ) perl(DBD::Pg) ( ) perl(Time::Piece) ( ) postgresql-server ( ) perl(:VERSION) ( >=  5.8.1) perl-DBD-Pg ( =  3.18.0-6.el10)"
RPROVIDES:perl-DBD-Pg-tests = "perl-DBD-Pg-tests ( =  3.18.0-6.el10) perl-DBD-Pg-tests(x86-64) ( =  3.18.0-6.el10)"
