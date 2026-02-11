
PN = "acpica-tools"
PE = "0"
PV = "20240322"
PR = "1.el10"
PACKAGES = "acpica-tools"


URI_acpica-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/acpica-tools-20240322-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:acpica-tools = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:acpica-tools = "acpica-tools ( =  20240322-1.el10) acpica-tools(x86-64) ( =  20240322-1.el10) acpidump ( >=  20100513-5) acpixtract ( >=  20120913-7) iasl ( =  20240322-1.el10) pmtools ( =  20240322-1.el10)"
