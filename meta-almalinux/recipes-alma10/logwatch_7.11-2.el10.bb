
PN = "logwatch"
PE = "0"
PV = "7.11"
PR = "2.el10"
PACKAGES = "logwatch"


URI_logwatch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/logwatch-7.11-2.el10.noarch.rpm;unpack=0"
RDEPENDS:logwatch = "/usr/bin/sh ( ) perl(strict) ( ) perl(warnings) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) perl(Cwd) ( ) grep ( ) perl(lib) ( ) perl(File::Temp) ( ) perl(Socket) ( ) perl(Errno) ( ) perl(re) ( ) perl(Time::Local) ( ) perl(subs) ( ) perl(HTML::Entities) ( ) perl(URI::URL) ( ) crontabs ( ) perl(Date::Manip) ( ) perl(diagnostics) ( )"
RPROVIDES:logwatch = "perl(Logwatch) ( ) config(logwatch) ( =  7.11-2.el10) logwatch ( =  7.11-2.el10)"
