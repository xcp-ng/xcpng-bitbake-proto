
PN = "pcsc-lite-ccid"
PE = "0"
PV = "1.6.0"
PR = "2.el10"
PACKAGES = "pcsc-lite-ccid"


URI_pcsc-lite-ccid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcsc-lite-ccid-1.6.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite-ccid = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) pcsc-lite(x86-64) ( >=  1.8.9)"
RPROVIDES:pcsc-lite-ccid = "pcsc-ifd-handler ( ) libccid.so()(64bit) ( ) libccidtwin.so()(64bit) ( ) bundled(simclist) ( =  1.6) ccid ( =  1.6.0-2.el10) config(pcsc-lite-ccid) ( =  1.6.0-2.el10) pcsc-lite-ccid ( =  1.6.0-2.el10) pcsc-lite-ccid(x86-64) ( =  1.6.0-2.el10)"
