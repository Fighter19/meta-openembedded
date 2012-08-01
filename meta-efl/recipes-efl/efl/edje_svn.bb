require ${BPN}.inc

SRCREV = "${EFL_SRCREV}"
PV = "1.2.1+svnr${SRCPV}"
PR = "${INC_PR}.0"
DEFAULT_PREFERENCE = "-1"

DEPENDS += "eio"

SRC_URI = "\
  ${E_SVN}/trunk;module=${SRCNAME};protocol=http;scmdata=keep \
"
S = "${WORKDIR}/${SRCNAME}"

FILES_${PN} += "${datadir}/mime/packages/edje.xml"
