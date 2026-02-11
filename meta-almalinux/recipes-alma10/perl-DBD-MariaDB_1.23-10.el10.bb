
PN = "perl-DBD-MariaDB"
PE = "0"
PV = "1.23"
PR = "10.el10"
PACKAGES = "perl-DBD-MariaDB perl-DBD-MariaDB-tests"


URI_perl-DBD-MariaDB = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-MariaDB-1.23-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MariaDB = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) libperl.so.5.40()(64bit) ( ) perl(DynaLoader) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) libmariadb.so.3()(64bit) ( ) libmariadb.so.3(libmysqlclient_18)(64bit) ( ) perl(DBI) ( ) perl(:MODULE_COMPAT_5.40.1) ( ) libmariadb.so.3(libmariadb_3)(64bit) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-DBD-MariaDB = "perl(DBD::MariaDB) ( =  1.23) perl-DBD-MariaDB ( =  1.23-10.el10) perl-DBD-MariaDB(x86-64) ( =  1.23-10.el10)"

URI_perl-DBD-MariaDB-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-MariaDB-tests-1.23-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MariaDB-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(lib) ( ) perl(vars) ( ) perl(File::Temp) ( ) perl(Data::Dumper) ( ) perl(utf8) ( ) perl(File::Path) ( ) perl(Encode) ( ) perl(FindBin) ( ) perl(B) ( ) perl(Time::HiRes) ( ) perl(Test::Deep) ( ) perl(CPAN::Meta::YAML) ( ) perl(DBI) ( ) hostname ( ) perl(DBI::Const::GetInfoType) ( ) perl(bigint) ( ) mariadb ( ) mariadb-server ( ) perl(DBD::MariaDB) ( ) perl-DBD-MariaDB ( =  1.23-10.el10)"
RPROVIDES:perl-DBD-MariaDB-tests = "perl-DBD-MariaDB-tests ( =  1.23-10.el10) perl-DBD-MariaDB-tests(x86-64) ( =  1.23-10.el10)"
