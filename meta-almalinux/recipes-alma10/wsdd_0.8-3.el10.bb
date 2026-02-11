
PN = "wsdd"
PE = "0"
PV = "0.8"
PR = "3.el10"
PACKAGES = "wsdd"


URI_wsdd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wsdd-0.8-3.el10.noarch.rpm;unpack=0"
RDEPENDS:wsdd = "/bin/sh ( ) shadow-utils ( ) /usr/bin/python3 ( )"
RPROVIDES:wsdd = "config(wsdd) ( =  0.8-3.el10) wsdd ( =  0.8-3.el10)"
