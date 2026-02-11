
PN = "perl-DBD-MySQL"
PE = "0"
PV = "5.007"
PR = "4.el10"
PACKAGES = "perl-DBD-MySQL perl-DBD-MySQL-tests"


URI_perl-DBD-MySQL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-MySQL-5.007-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MySQL = "
 perl-libs
 perl-Carp
 perl-DynaLoader
 perl-DBI
 perl-DBD-MySQL
 glibc
 mysql8.4-libs
"

URI_perl-DBD-MySQL-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-MySQL-tests-5.007-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MySQL-tests = "
 perl-libs
 mysql8.4
 perl-B
 perl-Test-Deep
 mysql8.4-server
 perl-Test-Harness
 perl-Test-Simple
 perl-CPAN-Meta-YAML
 perl-vars
 perl-DBD-MySQL
 perl-DBI
 perl-Data-Dumper
 perl-Time-HiRes
 shadow-utils
 bash
 perl-bignum
 coreutils
 perl-interpreter
 perl-File-Path
 perl-lib
"
