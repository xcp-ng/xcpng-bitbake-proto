
PN = "perl-IPC-Run3"
PE = "0"
PV = "0.049"
PR = "4.el10"
PACKAGES = "perl-IPC-Run3 perl-IPC-Run3-tests"


URI_perl-IPC-Run3 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IPC-Run3-0.049-4.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Run3 = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(constant) ( ) perl(File::Temp) ( ) perl(POSIX) ( ) perl(IPC::Run3::ProfReporter) ( )"
RPROVIDES:perl-IPC-Run3 = "perl(IPC::Run3) ( =  0.049) perl(IPC::Run3::ProfArrayBuffer) ( =  0.049) perl(IPC::Run3::ProfLogReader) ( =  0.049) perl(IPC::Run3::ProfLogger) ( =  0.049) perl(IPC::Run3::ProfPP) ( =  0.049) perl(IPC::Run3::ProfReporter) ( =  0.049) perl-IPC-Run3 ( =  0.049-4.el10)"

URI_perl-IPC-Run3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-Run3-tests-0.049-4.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Run3-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(Config) ( ) perl(Test) ( ) perl(IPC::Run3) ( ) perl(IPC::Run3::ProfArrayBuffer) ( ) perl(IPC::Run3::ProfLogReader) ( ) perl(IPC::Run3::ProfLogger) ( ) perl(IPC::Run3::ProfPP) ( ) perl(IPC::Run3::ProfReporter) ( ) perl-IPC-Run3 ( =  0.049-4.el10)"
RPROVIDES:perl-IPC-Run3-tests = "perl-IPC-Run3-tests ( =  0.049-4.el10)"
