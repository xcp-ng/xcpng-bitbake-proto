
PN = "perl-DBD-MySQL"
PE = "0"
PV = "5.007"
PR = "4.el10"
PACKAGES = "perl-DBD-MySQL perl-DBD-MySQL-tests"


URI_perl-DBD-MySQL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-MySQL-5.007-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MySQL = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(DynaLoader) ( ) perl(DBI) ( ) perl(DBD::mysql) ( ) libmysqlclient.so.24()(64bit) ( ) libmysqlclient.so.24(libmysqlclient_24.0)(64bit) ( ) perl(DBI::Const::GetInfoType) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-DBD-MySQL = "perl(DBD::mysql::GetInfo) ( ) perl(DBD::mysql::db) ( ) perl(DBD::mysql::dr) ( ) perl(DBD::mysql::st) ( ) perl(DBD::mysql) ( =  5.007) perl-DBD-MySQL ( =  5.007-4.el10) perl-DBD-MySQL(x86-64) ( =  5.007-4.el10) perl-DBD-mysql ( =  5.007-4.el10)"

URI_perl-DBD-MySQL-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-MySQL-tests-5.007-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MySQL-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(lib) ( ) perl(vars) ( ) perl(Data::Dumper) ( ) perl(File::Path) ( ) coreutils ( ) perl(B) ( ) shadow-utils ( ) perl(Time::HiRes) ( ) perl(Test::Deep) ( ) perl(CPAN::Meta::YAML) ( ) perl(DBI) ( ) perl(DBI::Const::GetInfoType) ( ) perl(bigint) ( ) mysql8.4 ( ) mysql8.4-server ( ) perl(DBD::mysql) ( ) perl-DBD-MySQL ( =  5.007-4.el10)"
RPROVIDES:perl-DBD-MySQL-tests = "perl-DBD-MySQL-tests ( =  5.007-4.el10) perl-DBD-MySQL-tests(x86-64) ( =  5.007-4.el10)"
