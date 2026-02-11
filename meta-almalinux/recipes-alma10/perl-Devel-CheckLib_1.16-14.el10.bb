
PN = "perl-Devel-CheckLib"
PE = "0"
PV = "1.16"
PR = "14.el10"
PACKAGES = "perl-Devel-CheckLib perl-Devel-CheckLib-tests"


URI_perl-Devel-CheckLib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Devel-CheckLib-1.16-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-CheckLib = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(File::Temp) ( ) redhat-rpm-config ( ) perl(Text::ParseWords) ( ) perl(Devel::CheckLib) ( ) perl(:VERSION) ( >=  5.4.50)"
RPROVIDES:perl-Devel-CheckLib = "perl(Devel::CheckLib) ( =  1.16) perl-Devel-CheckLib ( =  1.16-14.el10)"

URI_perl-Devel-CheckLib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-CheckLib-tests-1.16-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-CheckLib-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(File::Spec::Functions) ( ) perl(IO::File) ( ) gcc ( ) perl(Capture::Tiny) ( ) perl(Devel::CheckLib) ( ) perl-Devel-CheckLib ( =  1.16-14.el10)"
RPROVIDES:perl-Devel-CheckLib-tests = "perl-Devel-CheckLib-tests ( =  1.16-14.el10)"
