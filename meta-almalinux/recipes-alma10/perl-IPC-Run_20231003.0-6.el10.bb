
PN = "perl-IPC-Run"
PE = "0"
PV = "20231003.0"
PR = "6.el10"
PACKAGES = "perl-IPC-Run perl-IPC-Run-tests"


URI_perl-IPC-Run = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IPC-Run-20231003.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Run = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(vars) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(constant) ( ) perl(Fcntl) ( ) perl(POSIX) ( ) perl(Data::Dumper) ( ) perl(IO::Handle) ( ) perl(Scalar::Util) ( ) perl(Symbol) ( ) perl(IPC::Run) ( ) perl(IPC::Run::Debug) ( ) perl(IPC::Run::IO) ( ) perl(IPC::Run::Timer) ( ) perl(bytes) ( ) perl(Errno) ( ) perl(IO::Pty) ( >=  1.08)"
RPROVIDES:perl-IPC-Run = "perl(IPC::Run) ( =  20231003.0) perl(IPC::Run::Debug) ( =  20231003.0) perl(IPC::Run::IO) ( =  20231003.0) perl(IPC::Run::Timer) ( =  20231003.0) perl-IPC-Run ( =  20231003.0-6.el10)"

URI_perl-IPC-Run-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-Run-tests-20231003.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Run-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(IO::Handle) ( ) perl(Encode) ( ) perl(POSIX) ( ) perl(IPC::Run) ( ) perl(IPC::Run::Debug) ( ) perl(IPC::Run::IO) ( ) perl(IPC::Run::Timer) ( ) perl-IPC-Run ( =  20231003.0-6.el10)"
RPROVIDES:perl-IPC-Run-tests = "perl-IPC-Run-tests ( =  20231003.0-6.el10)"
