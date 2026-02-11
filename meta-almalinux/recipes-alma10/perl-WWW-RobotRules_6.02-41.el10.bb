
PN = "perl-WWW-RobotRules"
PE = "0"
PV = "6.02"
PR = "41.el10"
PACKAGES = "perl-WWW-RobotRules perl-WWW-RobotRules-tests"


URI_perl-WWW-RobotRules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-WWW-RobotRules-6.02-41.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-WWW-RobotRules = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(vars) ( ) perl(Fcntl) ( ) perl(WWW::RobotRules) ( ) perl(AnyDBM_File) ( ) perl(URI) ( >=  1.10)"
RPROVIDES:perl-WWW-RobotRules = "perl(WWW::RobotRules) ( =  6.02) perl(WWW::RobotRules::AnyDBM_File) ( =  6.00) perl-WWW-RobotRules ( =  6.02-41.el10)"

URI_perl-WWW-RobotRules-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-WWW-RobotRules-tests-6.02-41.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-WWW-RobotRules-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) /usr/bin/bash ( ) perl(Carp) ( ) coreutils ( ) perl(WWW::RobotRules) ( ) perl(WWW::RobotRules::AnyDBM_File) ( ) perl-WWW-RobotRules ( =  6.02-41.el10)"
RPROVIDES:perl-WWW-RobotRules-tests = "perl-WWW-RobotRules-tests ( =  6.02-41.el10)"
