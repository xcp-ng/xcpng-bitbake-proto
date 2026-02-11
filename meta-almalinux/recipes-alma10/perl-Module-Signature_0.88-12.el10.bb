
PN = "perl-Module-Signature"
PE = "0"
PV = "0.88"
PR = "12.el10"
PACKAGES = "perl-Module-Signature perl-Module-Signature-tests"


URI_perl-Module-Signature = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Signature-0.88-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Signature = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Spec) ( ) perl(File::Temp) ( ) perl(version) ( ) perl(IO::Socket::INET) ( ) perl(Digest::SHA) ( ) perl(ExtUtils::Manifest) ( ) gnupg2 ( ) perl(Module::Signature) ( ) perl(Text::Diff) ( ) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-Module-Signature = "perl(Module::Signature) ( =  0.88) perl-Module-Signature ( =  0.88-12.el10)"

URI_perl-Module-Signature-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Signature-tests-0.88-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Signature-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Data::Dumper) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(FindBin) ( ) perl(Getopt::Long) ( ) perl(Pod::Usage) ( ) perl(IPC::Run) ( ) perl(Module::Signature) ( ) perl-Module-Signature ( =  0.88-12.el10)"
RPROVIDES:perl-Module-Signature-tests = "perl-Module-Signature-tests ( =  0.88-12.el10)"
