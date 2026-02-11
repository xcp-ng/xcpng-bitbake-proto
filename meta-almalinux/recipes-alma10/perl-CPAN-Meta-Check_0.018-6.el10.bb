
PN = "perl-CPAN-Meta-Check"
PE = "0"
PV = "0.018"
PR = "6.el10"
PACKAGES = "perl-CPAN-Meta-Check perl-CPAN-Meta-Check-tests"


URI_perl-CPAN-Meta-Check = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-Meta-Check-0.018-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-Check = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(base) ( ) perl(CPAN::Meta::Requirements) ( >=  2.121) perl(CPAN::Meta::Prereqs) ( >=  2.132830) perl(Module::Metadata) ( >=  1.000023)"
RPROVIDES:perl-CPAN-Meta-Check = "perl(CPAN::Meta::Check) ( =  0.018) perl-CPAN-Meta-Check ( =  0.018-6.el10)"

URI_perl-CPAN-Meta-Check-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-Meta-Check-tests-0.018-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-Check-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(IO::Handle) ( ) perl(Scalar::Util) ( ) perl(IPC::Open3) ( ) perl(Env) ( ) perl(Module::Metadata) ( ) perl(CPAN::Meta::Check) ( ) perl(Test::More) ( >=  0.88) perl(:VERSION) ( >=  5.6.0) perl-CPAN-Meta-Check ( =  0.018-6.el10) perl(CPAN::Meta) ( >=  2.120920)"
RPROVIDES:perl-CPAN-Meta-Check-tests = "perl-CPAN-Meta-Check-tests ( =  0.018-6.el10)"
