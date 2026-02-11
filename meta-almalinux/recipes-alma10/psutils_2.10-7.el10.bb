
PN = "psutils"
PE = "0"
PV = "2.10"
PR = "7.el10"
PACKAGES = "psutils psutils-tests"


URI_psutils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psutils-2.10-7.el10.noarch.rpm;unpack=0"
RDEPENDS:psutils = "perl(strict) ( ) /usr/bin/perl ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(File::Temp) ( ) perl(base) ( ) perl(File::Basename) ( ) perl(File::Spec::Functions) ( ) perl(POSIX) ( ) perl(Fcntl) ( ) perl(Getopt::Long) ( ) perl(List::Util) ( ) perl(File::Copy) ( ) paper ( ) perl(IPC::Run3) ( ) perl(:VERSION) ( >=  5.14.0) perl(:VERSION) ( >=  5.10.0)"
RPROVIDES:psutils = "bundled(gnulib) ( ) psutils ( =  2.10-7.el10) psutils-perl ( =  2.10-7.el10)"

URI_psutils-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psutils-tests-2.10-7.el10.noarch.rpm;unpack=0"
RDEPENDS:psutils-tests = "/usr/bin/sh ( ) /usr/bin/bash ( ) coreutils ( ) make ( ) diffutils ( ) psutils ( =  2.10-7.el10)"
RPROVIDES:psutils-tests = "psutils-tests ( =  2.10-7.el10)"
