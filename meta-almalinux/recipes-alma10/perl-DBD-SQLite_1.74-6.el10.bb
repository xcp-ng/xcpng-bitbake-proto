
PN = "perl-DBD-SQLite"
PE = "0"
PV = "1.74"
PR = "6.el10"
PACKAGES = "perl-DBD-SQLite perl-DBD-SQLite-tests"


URI_perl-DBD-SQLite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-SQLite-1.74-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-SQLite = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(constant) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libsqlite3.so.0()(64bit) ( ) perl(Scalar::Util) ( ) perl(base) ( ) perl(Tie::Hash) ( ) perl(locale) ( ) perl(DBD::SQLite) ( ) perl(DBD::SQLite::VirtualTable) ( ) perl(:VERSION) ( >=  5.6.0) perl(DBI) ( >=  1.57)"
RPROVIDES:perl-DBD-SQLite = "perl(DBD::SQLite::Constants) ( ) perl(DBD::SQLite::GetInfo) ( ) perl(DBD::SQLite::VirtualTable::Cursor) ( ) perl(DBD::SQLite::VirtualTable::FileContent) ( ) perl(DBD::SQLite::VirtualTable::FileContent::Cursor) ( ) perl(DBD::SQLite::VirtualTable::PerlData) ( ) perl(DBD::SQLite::VirtualTable::PerlData::Cursor) ( ) perl(DBD::SQLite) ( =  1.74) perl(DBD::SQLite::VirtualTable) ( =  1.74) perl-DBD-SQLite ( =  1.74-6.el10) perl-DBD-SQLite(x86-64) ( =  1.74-6.el10)"

URI_perl-DBD-SQLite-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-SQLite-tests-1.74-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-SQLite-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(base) ( ) perl(Encode) ( ) perl(File::Spec::Functions) ( ) perl(POSIX) ( ) perl(FindBin) ( ) perl(Digest::MD5) ( ) perl(Time::HiRes) ( ) perl(if) ( ) perl(DBI) ( ) perl(DBI::Const::GetInfoType) ( ) perl(locale) ( ) perl(DBD::SQLite) ( ) perl(DBD::SQLite::Constants) ( ) perl(DBD::SQLite::VirtualTable) ( ) perl(DBD::SQLite::VirtualTable::Cursor) ( ) perl(:VERSION) ( >=  5.5.30) perl-DBD-SQLite ( =  1.74-6.el10)"
RPROVIDES:perl-DBD-SQLite-tests = "perl-DBD-SQLite-tests ( =  1.74-6.el10) perl-DBD-SQLite-tests(x86-64) ( =  1.74-6.el10)"
