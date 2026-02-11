
PN = "perl-Module-ScanDeps"
PE = "0"
PV = "1.37"
PR = "1.el10"
PACKAGES = "perl-Module-ScanDeps perl-Module-ScanDeps-tests"


URI_perl-Module-ScanDeps = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-ScanDeps-1.37-1.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-ScanDeps = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(Getopt::Long) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(Config) ( ) perl(Cwd) ( ) perl(constant) ( ) perl(File::Temp) ( ) perl(Data::Dumper) ( ) perl(Encode) ( ) perl(File::Path) ( ) perl(FindBin) ( ) perl(DynaLoader) ( ) perl(B) ( ) perl(File::Find) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Spec::Functions) ( ) perl(FileHandle) ( ) perl(Text::ParseWords) ( ) perl(Module::ScanDeps) ( ) perl(subs) ( ) perl(List::Util) ( ) perl(Module::Metadata) ( ) perl(version) ( ) perl(:VERSION) ( >=  5.8.1)"
RPROVIDES:perl-Module-ScanDeps = "perl(Module::ScanDeps::Cache) ( ) perl(Module::ScanDeps) ( =  1.37) perl-Module-ScanDeps ( =  1.37-1.el10)"

URI_perl-Module-ScanDeps-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-ScanDeps-tests-1.37-1.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-ScanDeps-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(File::Basename) ( ) perl(FindBin) ( ) perl(DynaLoader) ( ) perl(if) ( ) perl(version) ( ) perl(IPC::Run3) ( ) perl(less) ( ) perl(AutoLoader) ( ) perl(Net::FTP) ( ) perl(Test::Requires) ( ) perl(Module::ScanDeps) ( ) perl(autouse) ( ) perl-Module-ScanDeps ( =  1.37-1.el10)"
RPROVIDES:perl-Module-ScanDeps-tests = "perl-Module-ScanDeps-tests ( =  1.37-1.el10)"
