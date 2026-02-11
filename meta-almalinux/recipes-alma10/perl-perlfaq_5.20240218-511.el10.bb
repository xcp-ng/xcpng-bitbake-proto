
PN = "perl-perlfaq"
PE = "0"
PV = "5.20240218"
PR = "511.el10"
PACKAGES = "perl-perlfaq perl-perlfaq-tests"


URI_perl-perlfaq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-perlfaq-5.20240218-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-perlfaq = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( )"
RPROVIDES:perl-perlfaq = "perl(perlfaq) ( =  5.20240218) perl-perlfaq ( =  5.20240218-511.el10)"

URI_perl-perlfaq-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-perlfaq-tests-5.20240218-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-perlfaq-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(IO::Handle) ( ) perl(IPC::Open3) ( ) perl(:VERSION) ( >=  5.6.0) perl-perlfaq ( =  5.20240218-511.el10)"
RPROVIDES:perl-perlfaq-tests = "perl-perlfaq-tests ( =  5.20240218-511.el10)"
