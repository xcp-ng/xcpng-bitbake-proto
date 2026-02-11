
PN = "perl-Net-Ping"
PE = "0"
PV = "2.76"
PR = "511.el10"
PACKAGES = "perl-Net-Ping perl-Net-Ping-tests"


URI_perl-Net-Ping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-Ping-2.76-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-Ping = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(Fcntl) ( ) perl(Time::HiRes) ( ) perl(FileHandle) ( ) perl(IO::Socket::INET) ( ) perl(:VERSION) ( >=  5.2.0) perl(Socket) ( >=  2.007)"
RPROVIDES:perl-Net-Ping = "perl(Net::Ping) ( =  2.76) perl-Net-Ping ( =  2.76-511.el10)"

URI_perl-Net-Ping-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-Ping-tests-2.76-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-Ping-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(Cwd) ( ) perl(Socket) ( ) perl(IO::Socket::INET) ( ) perl(IO::Socket) ( ) perl(Net::Ping) ( ) perl(:VERSION) ( >=  5.6.0) perl-Net-Ping ( =  2.76-511.el10)"
RPROVIDES:perl-Net-Ping-tests = "perl-Net-Ping-tests ( =  2.76-511.el10)"
