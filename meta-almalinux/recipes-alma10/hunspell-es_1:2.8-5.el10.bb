
inherit dnf-bridge

PN = "hunspell-es"
PE = "1"
PV = "2.8"
PR = "5.el10"
PACKAGES = "hunspell-es hunspell-es-AR hunspell-es-BO hunspell-es-CL hunspell-es-CO hunspell-es-CR hunspell-es-CU hunspell-es-DO hunspell-es-EC hunspell-es-ES hunspell-es-GQ hunspell-es-GT hunspell-es-HN hunspell-es-MX hunspell-es-NI hunspell-es-PA hunspell-es-PE hunspell-es-PR hunspell-es-PY hunspell-es-SV hunspell-es-US hunspell-es-UY hunspell-es-VE"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-es-2.8-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-es = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es}"
RDEPENDS:hunspell-es = " \
 hunspell-es-AR \
 hunspell-es-BO \
 hunspell-es-CL \
 hunspell-es-CO \
 hunspell-es-CR \
 hunspell-es-CU \
 hunspell-es-DO \
 hunspell-es-EC \
 hunspell-es-ES \
 hunspell-es-GQ \
 hunspell-es-GT \
 hunspell-es-HN \
 hunspell-es-MX \
 hunspell-es-NI \
 hunspell-es-PA \
 hunspell-es-PE \
 hunspell-es-PR \
 hunspell-es-PY \
 hunspell-es-SV \
 hunspell-es-US \
 hunspell-es-UY \
 hunspell-es-VE \
 hunspell-filesystem \
"

URI_hunspell-es-AR = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-AR-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-AR}"
RDEPENDS:hunspell-es-AR = " \
 hunspell \
"

URI_hunspell-es-BO = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-BO-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-BO}"
RDEPENDS:hunspell-es-BO = " \
 hunspell \
"

URI_hunspell-es-CL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-CL-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-CL}"
RDEPENDS:hunspell-es-CL = " \
 hunspell \
"

URI_hunspell-es-CO = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-CO-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-CO}"
RDEPENDS:hunspell-es-CO = " \
 hunspell \
"

URI_hunspell-es-CR = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-CR-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-CR}"
RDEPENDS:hunspell-es-CR = " \
 hunspell \
"

URI_hunspell-es-CU = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-CU-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-CU}"
RDEPENDS:hunspell-es-CU = " \
 hunspell \
"

URI_hunspell-es-DO = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-DO-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-DO}"
RDEPENDS:hunspell-es-DO = " \
 hunspell \
"

URI_hunspell-es-EC = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-EC-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-EC}"
RDEPENDS:hunspell-es-EC = " \
 hunspell \
"

URI_hunspell-es-ES = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-ES-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-ES}"
RDEPENDS:hunspell-es-ES = " \
 hunspell \
"

URI_hunspell-es-GQ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-GQ-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-GQ}"
RDEPENDS:hunspell-es-GQ = " \
 hunspell \
"

URI_hunspell-es-GT = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-GT-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-GT}"
RDEPENDS:hunspell-es-GT = " \
 hunspell \
"

URI_hunspell-es-HN = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-HN-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-HN}"
RDEPENDS:hunspell-es-HN = " \
 hunspell \
"

URI_hunspell-es-MX = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-MX-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-MX}"
RDEPENDS:hunspell-es-MX = " \
 hunspell \
"

URI_hunspell-es-NI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-NI-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-NI}"
RDEPENDS:hunspell-es-NI = " \
 hunspell \
"

URI_hunspell-es-PA = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-PA-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-PA}"
RDEPENDS:hunspell-es-PA = " \
 hunspell \
"

URI_hunspell-es-PE = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-PE-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-PE}"
RDEPENDS:hunspell-es-PE = " \
 hunspell \
"

URI_hunspell-es-PR = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-PR-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-PR}"
RDEPENDS:hunspell-es-PR = " \
 hunspell \
"

URI_hunspell-es-PY = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-PY-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-PY}"
RDEPENDS:hunspell-es-PY = " \
 hunspell \
"

URI_hunspell-es-SV = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-SV-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-SV}"
RDEPENDS:hunspell-es-SV = " \
 hunspell \
"

URI_hunspell-es-US = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-US-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-US}"
RDEPENDS:hunspell-es-US = " \
 hunspell \
"

URI_hunspell-es-UY = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-UY-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-UY}"
RDEPENDS:hunspell-es-UY = " \
 hunspell \
"

URI_hunspell-es-VE = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-es-VE-2.8-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-es-VE}"
RDEPENDS:hunspell-es-VE = " \
 hunspell \
"
