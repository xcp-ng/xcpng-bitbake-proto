
PN = "perl-File-Slurper"
PE = "0"
PV = "0.014"
PR = "6.el10"
PACKAGES = "perl-File-Slurper perl-File-Slurper-tests"


URI_perl-File-Slurper = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Slurper-0.014-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurper = "perl(strict) ( ) perl(warnings) ( ) perl(Carp) ( ) perl-libs ( ) perl(constant) ( ) perl(PerlIO::encoding) ( ) perl(Exporter) ( >=  5.57) perl(Encode) ( >=  2.11)"
RPROVIDES:perl-File-Slurper = "perl-File-Slurper ( =  0.014-6.el10) perl(File::Slurper) ( =  0.014)"

URI_perl-File-Slurper-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Slurper-tests-0.014-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurper-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Temp) ( ) perl(File::Spec::Functions) ( ) perl(FindBin) ( ) perl(Test::Warnings) ( ) perl(File::Slurper) ( ) perl-File-Slurper ( =  0.014-6.el10)"
RPROVIDES:perl-File-Slurper-tests = "perl-File-Slurper-tests ( =  0.014-6.el10)"
