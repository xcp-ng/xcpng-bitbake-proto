
PN = "perl-WWW-RobotRules"
PE = "0"
PV = "6.02"
PR = "41.el10"
PACKAGES = "perl-WWW-RobotRules perl-WWW-RobotRules-tests"


URI_perl-WWW-RobotRules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-WWW-RobotRules-6.02-41.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-WWW-RobotRules = "
 perl-libs
 perl-Carp
 perl-vars
 perl-URI
 perl-Fcntl
 perl-WWW-RobotRules
"

URI_perl-WWW-RobotRules-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-WWW-RobotRules-tests-6.02-41.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-WWW-RobotRules-tests = "
 perl-Test-Harness
 perl-libs
 perl-Carp
 perl-WWW-RobotRules
 bash
 coreutils
 perl-interpreter
"
