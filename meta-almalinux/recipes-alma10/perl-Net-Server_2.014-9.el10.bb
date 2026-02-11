
PN = "perl-Net-Server"
PE = "0"
PV = "2.014"
PR = "9.el10"
PACKAGES = "perl-Net-Server perl-Net-Server-tests"


URI_perl-Net-Server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-Server-2.014-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-Server = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(POSIX) ( ) perl(Fcntl) ( ) perl(Scalar::Util) ( ) perl(base) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) perl(Socket) ( ) perl(Errno) ( ) perl(Time::HiRes) ( ) perl(IO::Socket) ( ) perl(re) ( ) perl(IO::Select) ( ) perl(IO::Socket::INET) ( ) perl(IO::Socket::IP) ( ) perl(IO::Socket::UNIX) ( ) perl(Net::Server) ( ) perl(Net::Server::Daemonize) ( ) perl(Net::Server::SIG) ( ) perl(Sys::Syslog) ( ) perl(IO::Multiplex) ( >=  1.05)"
RPROVIDES:perl-Net-Server = "perl(Net::Server::Fork) ( ) perl(Net::Server::HTTP) ( ) perl(Net::Server::INET) ( ) perl(Net::Server::INET::Handle) ( ) perl(Net::Server::Log::Log::Log4perl) ( ) perl(Net::Server::Log::Sys::Syslog) ( ) perl(Net::Server::MultiType) ( ) perl(Net::Server::Multiplex) ( ) perl(Net::Server::Multiplex::MUX) ( ) perl(Net::Server::PSGI) ( ) perl(Net::Server::PreFork) ( ) perl(Net::Server::PreForkSimple) ( ) perl(Net::Server::Proto) ( ) perl(Net::Server::Proto::SSL) ( ) perl(Net::Server::Proto::SSLEAY) ( ) perl(Net::Server::Proto::TCP) ( ) perl(Net::Server::Proto::UDP) ( ) perl(Net::Server::Proto::UNIX) ( ) perl(Net::Server::Proto::UNIXDGRAM) ( ) perl(Net::Server::Single) ( ) perl(Net::Server::Thread) ( ) perl(Net::Server::TiedHandle) ( ) perl(Net::Server) ( =  2.014) perl(Net::Server::Daemonize) ( =  0.06) perl(Net::Server::SIG) ( =  0.03) perl-Net-Server ( =  2.014-9.el10)"

URI_perl-Net-Server-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-Server-tests-2.014-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-Server-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(lib) ( ) perl(Exporter) ( ) perl(File::Temp) ( ) perl(constant) ( ) perl(File::Spec::Functions) ( ) perl(FindBin) ( ) perl(IO::Socket) ( ) perl(English) ( ) perl(Net::Server) ( ) perl-Net-Server ( =  2.014-9.el10)"
RPROVIDES:perl-Net-Server-tests = "perl-Net-Server-tests ( =  2.014-9.el10)"
